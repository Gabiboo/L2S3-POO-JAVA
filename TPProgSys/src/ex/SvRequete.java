package ex;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class SvRequete extends Service<Void> {
	static final int LIMIT = 50;
	static final String URL_LIST = "https://hacker-news.firebaseio.com/v0/newstories.json";
	static final String URL_ITEM = "https://hacker-news.firebaseio.com/v0/item/%d.json";

	@Override
	protected Task<Void> createTask() {
		return new Task<Void>() {
			@Override
			protected Void call() {
				
					// Paramétrage de l'objet faisant la conversion des données reçues en objet Java
					ObjectMapper objectMapper = new ObjectMapper();
					objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
					long[] newstories = {};
					try {
						System.out.println("Récupération de la liste des nouvelles");
						// Accès internet permettant de récupèrer en une fois
						// une liste de 500 numéros des nouvelles les plus récente,
						// Le tableau newstories recevant cette liste
						newstories = objectMapper.readValue(new URL(URL_LIST), long[].class);
					} catch (IOException e) {
						System.out.println("Erreur récupération liste : " + e.toString());
					}
					for(int i=0;i<Math.min(LIMIT, newstories.length);i++) {
						try {
							System.out.println("Récupération " + (i+1) + "/" + LIMIT + " : " + newstories[i]);
							// Accès internet permettant de récupérer le détail de la nouvelle n° newstories[i],
							// L'objet item recevant le détail de cette nouvelle
							Item item = objectMapper.readValue(new URL(String.format(URL_ITEM, newstories[i])), Item.class);
							if (item != null) {
								//observableList.set(i, (i+1) + "\n" + item.toString());
								System.out.println(item);
							}
						} catch (IOException e) {
							System.out.println("Erreur récupération détail : " + e.toString());
						}
					}
				
				return null;
			}
		};
	}
}
