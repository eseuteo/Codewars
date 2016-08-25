
public class Pyramid {
	public static String watchPyramidFromTheSide(String characters) {
		System.out.println(characters);
		String res = characters;
		if (characters != null){
			int height = characters.length();
			int width = getOdd(height - 1);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < height; i++) {
				int space = height - (i + 1);
				for (int j = 0; j < width; j++) {
					if (j >= space && j < width - space) {
						sb.append(characters.charAt(height - 1 - i));
					} else {
						sb.append(" ");
					}
				}
				if (i < height - 1)
					sb.append("\n");
			}
			res = sb.toString();
		}
		return res;
	}

	public static String watchPyramidFromAbove(String characters) {
		String res = characters;
		if (characters != null){
			int height = characters.length();
			int side = getOdd(height - 1);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < side; i++) {
				for (int j = 0; j < side; j++) {
					int a = i > side / 2 ? side - (i + 1) : i;
					int b = j > side / 2 ? side - (j + 1) : j;
					int indexToAdd = Math.min(a, b);
					char charToAdd = characters.charAt(indexToAdd);
					sb.append(charToAdd);
				}
				if (i < side - 1)
					sb.append("\n");
			}
			res = sb.toString();
		}
		return res;
	}

	public static int countVisibleCharactersOfThePyramid(String characters) {
		System.out.println(characters);
		int res = -1;
		if (characters != null){
			res = getOdd(characters.length() - 1) * getOdd(characters.length() - 1);
		}
		return res;
	}

	public static int countAllCharactersOfThePyramid(String characters) {
		System.out.println(characters);
		int res = -1;
		if (characters != null){
			res=0;
			int base = (int) Math.sqrt(countVisibleCharactersOfThePyramid(characters));
			for (int i = base; i > 0; i -= 2) {
				res += i * i;
			}
		}
		return res;
	}

	private static int getOdd(int num) {
		return 2 * num + 1;
	}
}