class SpaceNeedle {
  public static final int Size = 6;
  public static void main(String[] args) {
    needle(Size);
        colon(Size);
        quotationMarks(Size);
        support(Size);
        elevatorAndBase(Size);
    }
  public static void needle(int barSize) {
        int length  = Size * 3 + 2;
        for (int i = 0; i < barSize; i++) {
                for (int j = length; j > 2; j--) {
                    System.out.print(" ");
                }
                System.out.print("||");
                System.out.println();
            }
    }
  public static void colon(int Size) {
          for (int i = 0; i < Size; i++) {
                for (int j = 1; j < Size - i; j++) {
                    System.out.print("   ");
                } 
                System.out.print("__/");
                for (int j = 0; j < i; j++) {
                    System.out.print(":::");
                }
                System.out.print("||");
                for (int j = 0; j < i; j++) {
                    System.out.print(":::"); 
                }
               System.out.print("\\__");
               System.out.println(); 
            }
    }
    public static void quotationMarks(int Size) {
          for (int i = 0; i <= 0; i++) {
                System.out.print("|");
                for (int j = 3 * Size; j > 2 * i; j--) {
                    System.out.print("\"\"");
                }
                System.out.print("|");
                System.out.println();
            }
    }
   public static void support(int Size) {
          int halo = 3 * Size - 1;
          for (int i = 0; i < Size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.print("\\_");
                for (int j = 0; j < halo; j++) {
                System.out.print("/\\");
                }
                System.out.print("_/");
                System.out.println();
                halo -= 2;
            }
        }
  public static void elevatorAndBase(int Size) {
      int length = Size * 3 + 2;
      int stringLength = length / 2;
      needle(Size);
      for (int i = 0; i < Size * 4; i++) {
            for (int j = length; j > 5; j--) {
                    System.out.print(" ");
                }
            System.out.print("|%%||%%|");
             System.out.println();
            }
      colon(Size);
      quotationMarks(Size);
        }
}
        