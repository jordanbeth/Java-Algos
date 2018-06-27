
/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to 
 * the sum of the numbers on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */

// My solution
public boolean canBalance(int[] nums) {
  
  if(nums.length == 1) return false;
  
  int start = 0, end = nums.length - 1;
  
  // start from either end, subtract the between them move the bigger one forward
  int diff = nums[start] - nums[end];
  
  while(start <= end) {
    
    if(start == end) {
      return diff == 0;
    } 
      
    diff = nums[start] - nums[end];
  
    // equal
    if(diff == 0) {
      start++;
      end--;
      
      if(start == end) {
        return false;
      }
      
    } else if (diff < 0) {  // nums[end] is greater - move start pointer forward
      nums[end] = -diff;
      start++;
    } else if (diff > 0) {  // nums[start] is greater - move end pointer backward
      nums[start] = diff;
      end--;
    }
  }
  
  return diff == 0;
  
}
