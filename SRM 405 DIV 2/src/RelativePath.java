import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RelativePath {
	
	public String makeRelative(String path, String currentDir) {
		String[] pathArray = path.split("/");
		String[] currentDirArray = currentDir.split("/");
		int i = 0;
		while (i < pathArray.length && i < currentDirArray.length) {
			if (!pathArray[i].equals(currentDirArray[i])) {

				break;
			}
			i++;
		}

		i--;

		ArrayList<String> result = new ArrayList<>();
		for (int j = 0; j < currentDirArray.length - i - 1; j++) {
			result.add("..");
		}
		for (int j = i+1; j < pathArray.length; j++) {
			if (!pathArray[j].equals("")) {
				result.add(pathArray[j]);
			}
		}


		return String.join( "/",result.toArray(new String[0]));
	}
}
