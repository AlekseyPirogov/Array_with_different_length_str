public class Main {

    public static void main(String[] args) {

        String[][] array_4x4_uncorrectData = {{"0", "1", "-1"},
                                              {"6", "0x78", "5", "10a"},
                                              {"0", "1", "100", "-90"},
                                              {"0a", "Str", "S3S", "1q", "123"}};

        for (int i=0; i<array_4x4_uncorrectData.length; i++) {
            for(int j=0; j<array_4x4_uncorrectData[i].length; j++) {

                System.out.print(array_4x4_uncorrectData[i][j] + " ");

                if(j==(array_4x4_uncorrectData[i].length-1)){
                    System.out.println("");
                }
            }
        }

    }
}
