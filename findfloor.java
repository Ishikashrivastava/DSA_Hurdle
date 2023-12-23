class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        
        int low = 0, high = n - 1;
        int floorIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid; // If x is present in the array, return its index
            } else if (arr[mid] < x) {
                floorIndex = mid; // Update the potential floor index and search in the right half
                low = mid + 1;
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return floorIndex;
    }
    
}
