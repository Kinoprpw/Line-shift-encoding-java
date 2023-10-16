package model;

public class chuyendichdongact {

    static char[][] themmatran(String key, String plaintext) {

        if (plaintext.length() % key.length() == 0) {
            int row = plaintext.length() / key.length();
            int colum = key.length();
            char matrix[][] = new char[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    int k = i * colum;
                    matrix[i][j] = plaintext.charAt(k + j);
                }
            }
            return matrix;
        } else {
            int row = plaintext.length() / key.length();
            int colum = key.length();
            char matrix1[][] = new char[row + 1][colum];
            char none = 'z';
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    int k = i * colum;
                    matrix1[i][j] = plaintext.charAt(k + j);
                }
            }
            for (int i = row; i < row + 1; i++) {
                for (int j = 0; j < plaintext.length() % key.length(); j++) {
                    int k = i * colum;
                    matrix1[i][j] = plaintext.charAt(k + j);
                }
            }
            for (int i = row; i < row + 1; i++) {
                for (int j = plaintext.length() % key.length(); j < colum; j++) {
                    matrix1[i][j] = none;
                }
            }
            return matrix1;
        }
    }

    static void inMatrix(char[][] matran, String key, String plaintext) {
        if (plaintext.length() % key.length() == 0) {
            for (int i = 0; i < key.length(); i++) {
                for (int j = 0; j < key.length(); j++) {
                    System.out.print(matran[i][j]);
                }
            }
        } else {
            for (int i = 0; i < (plaintext.length() / key.length()) + 1; i++) {
                for (int j = 0; j < key.length(); j++) {
                    System.out.print(matran[i][j]);
                }
            }
        }
        System.out.println(" ");
    }

    static String encryp( String key, String plaintext) {
        String outputString = "";
        int row = plaintext.length() / key.length();
        if (plaintext.length() % key.length() == 0) {
            char matrix[][] = themmatran(key, plaintext);
            for (char w = 'a'; w < 'z'; w++) {
                int a = key.indexOf(w);

                if (a != -1) {
                    for (int i = 0; i < row; i++) {
                        outputString += matrix[i][a];
                    }
                }

            }
        } else {
            char matrix[][] = themmatran(key, plaintext);
            for (char w = 'a'; w < 'z'; w++) {
                int a = key.indexOf(w);

                if (a != -1) {
                    for (int i = 0; i < row + 1; i++) {
                        outputString += matrix[i][a];
                    }
                }
            }
        }
        return outputString;
    }

    static char[][] themmatran1(String key, String plaintext) {
        int row = plaintext.length() / key.length();
        int colum = key.length();
        char matrix[][] = new char[row][colum];
        int j = 0;
        for (char w = 'a'; w < 'z'; w++) {
            int a = key.indexOf(w);
            if (a != -1) {
                int k = j * row;
                for (int i = 0; i < row; i++) {
                    matrix[i][a] = plaintext.charAt(k + i);
                }
                j++;
            }
        }
        return matrix;
    }
    static String decryp( String key, String plaintext) {
        String outputString = "";
         char matrix[][] = themmatran1(key, plaintext);
        int row = plaintext.length() / key.length();
        for (int i = 0; i < row; i++) {
                for (int j = 0; j < key.length(); j++) {
                   outputString+=matrix[i][j];
                }
            }
        return outputString;
    }

    public static void main(String[] args) {
        String key = "humab";
        String plaintext = "chaocacbanminhtenlaminhnezf";
        String ciphertext = "oahanzcntmezcameizabnlhzhcinnf";
        //encryption
        System.out.println("ma hoa: "+encryp(key, plaintext));
        //decryption
        System.out.println("giai ma: "+decryp(key, ciphertext));
    }
}
