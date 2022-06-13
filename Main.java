class Main {
  public static void main(String[] args) {


 int [] nums2 = {1,2,3,4};
 int temp = nums2[0]; // saving first vairable

 for (int i=0; i < nums2.length-1; i++)
 {
   nums2[i] = nums2[i+1];
 }
 nums2[nums2.length-1] = temp;

 for (int i = 0; i < nums2.length; i++)
 { 
   System.out.print(nums2[i] + " ");
 }

 //shifting to the right

 System.out.println();


 int temp2 = nums2[nums2.length-1]; // last element

 for (int i= nums2.length-1; i > 0; i--)
 {
   nums2[i] = nums2[i-1];
 }

 nums2[0] = temp2;

for (int i = 0; i < nums2.length; i++)
 { 
   System.out.print(nums2[i] + " ");
 }

// reversing the elements - using swap inside the for loop

System.out.println();
for (int i = 0; i < nums2.length/2; i++)
 { 
   int j = num2s.length-i -1;
   int temp3 = nums2[i];
   nums2[i] = nums2[j];
   nums2[j] = temp3;

 }

 for (int i = 0; i < nums2.length; i++)
 { 
   System.out.print(nums2[i] + " ");
 }

  }
}