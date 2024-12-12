

class TwoDArrayExample{
    public static void main(String[] args){
        int[][] twodarr ={
            {1,2,4},
            {3,2,1},
            {5,2,9}
        };
    // int[][] twodarr = {{2,3,6},{2,5,3},{2,8,9},{5,1,7}}
        
    for(int i = 0;i< twodarr.length;i++){           //this will read how many rows are there
        for(int j = 0;j < twodarr[i].length;j++){   //this will read how many columns and print it
            System.out.print(twodarr[i][j] + " ");
        }
        System.out.println();
    }
    
    }
}