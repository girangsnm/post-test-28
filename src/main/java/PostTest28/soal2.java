package PostTest28;

public class soal2 {

	public static void main(String[] args) {
		for (int i = 10; i > 1; i -= 2) {
			int j;
			if (i == 10) {
				for (j = 1; j < i; ++j) {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(j);
					}
				}
			} else if (i == 8) {
				for (j = 2; j <= i; ++j) {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(j);
					}
				}
			} else if (i == 6) {
				for (j = 3; j <= i + 1; ++j) {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(j);
					}
				}
			} else if (i == 4) {
				for (j = 4; j <= i + 2; ++j) {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(j);
					}
				}
			} else if (i == 2) {
				for (j = 5; j <= i + 3; ++j) {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(j);
					}
				}
			}

			System.out.println();
		}
	}

}
