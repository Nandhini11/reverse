public static void main (String [] argv)
{
     final int x = 123456789;
     int newX = x;

     /* How many digits are there? */
     final double originalLog = Math.floor (Math.log10 (x));

     /* Let's subtract 10 to that power until the number is smaller */
     final int getRidOf = (int)Math.pow (10, originalLog);
     while (originalLog == Math.floor (Math.log10 (newX)))
     { newX -= getRidOf; }

     System.out.println (newX);
}
