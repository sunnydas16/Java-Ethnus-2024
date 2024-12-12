

//rows and columns are not fix is called Jagged Array

class JaggedArray{
    public static void main(String[] args){

        int[][] jagarr = {
            {2,3},
            {3,6,9,1},
            {2,5,1},
            {2,8,4,1,0}
        };

        // int[][] twodarr = {{2,6},{2,5,4,3},{2,8,9,2,2},{5}}

        for(int i = 0;i < jagarr.length;i++){          //this will read how many rows are there
            for(int j = 0;j < jagarr[i].length;j++){   //this will read how many columns and print it
                System.out.print(jagarr[i][j]);
            }
            System.out.println();
        }

    }
}