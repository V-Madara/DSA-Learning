package Assignment.Array;

public class Flipping {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length + 1) / 2; j++) {
                temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - 1 - j] = temp;
            }
        }
        return image;
    }

}
