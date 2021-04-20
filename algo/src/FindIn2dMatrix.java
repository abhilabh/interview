public class FindIn2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int start = 0, end = c-1,mid=0;
        while(start<=end){
            mid = (start+end)/2;
            System.out.print(mid);
            if(matrix[0][mid]==target) return true;
            if(mid+1 < c && target> matrix[0][mid] && target < matrix[0][mid+1]) break;
            else if(target< matrix[0][mid]) end = mid -1;
            else start = mid + 1;
        }
        System.out.print(mid);

        start = 0;
        end = r-1;
        while(start<=end){
            int mid1 = (start+end)/2;
            if(matrix[mid1][mid]==target) return true;
            else if(target <matrix[mid1][mid]) end = mid1 -1;
            else start = mid1+1;
        }

        return false;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        FindIn2dMatrix x = new FindIn2dMatrix();
        x.searchMatrix(matrix,19);

    }
}
