import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import com.collection.AddElementToFirstInArrayList;

public class IterateThroughAllElementsInLinkedList {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		log.info(list.toString());
		
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			log.info(iterator.next().toString());
		}
	}
}
