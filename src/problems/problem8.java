package problems;

public class problem8 {
        public static void main(String[] args) {
            String plaintext = "if man was meant to stay on the ground god would have given us roots.";
            String encrypted = encryptText(plaintext);
            System.out.println("Encrypted text: \n" + encrypted);
        }

        public static String encryptText(String text) {
            //eliminate spaces from text
            String modifiedText = text.replaceAll("\\s", "");

            //verify if text exists
            if (modifiedText.length() == 0) {
                return "The text cannot be empty!";
            }

            //calculate the length of the modified text
            int L = modifiedText.length();

            //determine the number of rows and cols
            int row = (int) Math.floor(Math.sqrt(L));
            int column = (int) Math.ceil(Math.sqrt(L));

            //ensure that the number of columns is at least as long as the last line
            while (row * column < L) {
                row++;
            }

            //building the grid
            String[] grid = new String[row];
            int currentIndex = 0;
            for (int i = 0; i < row; i++) {
                StringBuilder rowText = new StringBuilder();
                for (int j = 0; j < column; j++) {
                    if (currentIndex < L) {
                        rowText.append(modifiedText.charAt(currentIndex));
                        currentIndex++;
                    }
                }
                grid[i] = rowText.toString();
            }

            //building encrypted text
            StringBuilder encryptedText = new StringBuilder();
            for (int i = 0; i < row; i++) {
                encryptedText.append(grid[i]);
                if (i != row - 1) {
                    encryptedText.append(' ');
                }
            }

            return encryptedText.toString();
        }
    }

