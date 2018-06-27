
/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
 * Return the number of clumps in the given array.
 * ex:
 * countClumps([1, 2, 2, 3, 4, 4]) → 2
 * countClumps([1, 1, 2, 1, 1]) → 2
 * countClumps([1, 1, 1, 1, 1]) → 1
 */
 
public int countClumps(int[] nums) {
  
  int count = 0;
  
  boolean longRun = false;
  // check for adjacenct, same value elements
  for(int i = 0; i < nums.length - 1; i++) {
    
    // if adjacent and same value check to 
    // make sure it has not already been accounted for
    if(nums[i] == nums[i+1]) {
      
      if(!longRun) {
        count++;
        longRun = true;
      }
    
    } else {
      longRun = false;
    }
  }

  return count; // return clump count
  
}
