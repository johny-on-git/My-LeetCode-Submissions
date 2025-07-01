class Solution {
    public int numIslands(char[][] grid) {
    
    Integer countOfIslands = 0; 
    Integer rows=grid.length;
    Integer cols= grid[0].length;
    boolean[][] visited = new boolean[rows][cols];
    
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if(grid[i][j] == '1' && !visited[i][j])
            {
                countOfIslands = countOfIslands+1;
                visitConnectedLands(grid, visited,i, j);

            }
        }
    }
    return countOfIslands;
        
    }

    public void visitConnectedLands(char[][] grid, boolean[][] visited,int i,int j)
    {
        if( i <0 || i == grid.length || j <0 || j == grid[0].length  )
           {
            return ;
           }

           if(visited[i][j])
           {
            return;
           }
           if(grid[i][j] == '0' )
           {
                return;
           }

           
           visited[i][j]  = true;
           visitConnectedLands(grid, visited,i+1, j);
           visitConnectedLands(grid, visited,i-1, j);
           visitConnectedLands(grid, visited,i, j+1);
           visitConnectedLands(grid, visited,i, j-1); 

    }

}