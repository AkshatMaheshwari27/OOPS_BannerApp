import java.util.HashMap;
import java.util.Map;

public class OOPS_BannerApp
{
    // Step 1: Create Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) 
    {
        initializePatterns();      // Load patterns into map
        renderBanner("OOPS");      // Render word dynamically
    }

    // Step 2: Initialize patterns
    private static void initializePatterns() 
    {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                " *** ",
                "*   *",
                "*   *",
                " *** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " *** ",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                " *** "
        });
    }

    // Step 3: Render function using nested loops
    private static void renderBanner(String word) 
    {
        int height = 7;

        for (int row = 0; row < height; row++) 
        {
            for (char ch : word.toCharArray()) 
            {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) 
                {
                    System.out.print(pattern[row] + "   ");
                }
            }
            System.out.println();
        }
    }
}