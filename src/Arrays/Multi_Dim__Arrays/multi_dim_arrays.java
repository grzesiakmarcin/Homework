package Arrays.Multi_Dim__Arrays;

public class multi_dim_arrays {

    public static void main(String[] args) {

        int[] values = {3,5,234,211};
        System.out.println(values[3]);





        int[][] grid={
                {11,32,43},
                {3,2,6,12},
                {242423,455,223,65,443,23},
        };



        System.out.println(grid[0][1]);
        System.out.println();



            for (int x = 0; x < grid[1].length ;x++){
                System.out.println(grid[1][x]);
            }

        System.out.println();

            for (int wiesz=0; wiesz<grid.length; wiesz++){
                for (int zawTab=0; zawTab<grid[wiesz].length ;zawTab++){
                    System.out.println(grid[wiesz][zawTab]);
                }

            }















    }


}
