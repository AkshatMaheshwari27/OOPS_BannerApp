public class OOPS_BannerApp 
{
    public static void main(String[] args) 
    {
        // Step 1: Declare array
        String[] banner = new String[7];

        // Step 2: Populate array elements separately
        banner[0] = String.join("   ", " *** ", " *** ", " *** ", " *** ");
        banner[1] = String.join("   ", "*   *", "*   *", "*   *", "*    ");
        banner[2] = String.join("   ", "*   *", "*   *", "*   *", "*    ");
        banner[3] = String.join("   ", "*   *", "*   *", " *** ", " *** ");
        banner[4] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        banner[5] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        banner[6] = String.join("   ", " *** ", " *** ", "*    ", " *** ");

        // Step 3: Print using enhanced for-loop
        for (String row : banner) 
        {
            System.out.println(row);
        }
    }
}