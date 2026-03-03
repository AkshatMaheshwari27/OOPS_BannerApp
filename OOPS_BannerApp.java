public class OOPS_BannerApp 
{
    public static void main(String[] args) 
    {
        String row1 = String.join("   ",
                " *** ",
                " *** ",
                " *** ",
                " *** "
        );

        String row2 = String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*    "
        );

        String row3 = String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*    "
        );

        String row4 = String.join("   ",
                "*   *",
                "*   *",
                " *** ",
                " *** "
        );

        String row5 = String.join("   ",
                "*   *",
                "*   *",
                "*    ",
                "    *"
        );

        String row6 = String.join("   ",
                "*   *",
                "*   *",
                "*    ",
                "    *"
        );

        String row7 = String.join("   ",
                " *** ",
                " *** ",
                "*    ",
                " *** "
        );

        // Print banner
        System.out.println(String.join("\n",
                row1,
                row2,
                row3,
                row4,
                row5,
                row6,
                row7
        ));
    }
}
}
