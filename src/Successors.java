public class Successors {
    public static Position findPosition(int value, int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
            {
                if (value == arr[i][j])
                    return new Position(i,j);
            }
        }

        return null;
    }
    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] result = new Position[arr.length][];
        for (int i = 0; i < arr.length; i++){
            result[i] = new Position[arr[i].length];
            for (int j = 0; j < arr[i].length; j++){
                result[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }
        return result;
    }
}
