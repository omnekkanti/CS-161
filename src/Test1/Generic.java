package Test1;


public class Generic <x,y>{
   public x om;
   public y prakash;

   public Generic(x p1, y p2) {
        this.om = p1;
        this.prakash = p2;
    }
    //with above constructor active, it is looking for object, object arguements in the constructor statement. basically anything
    public static <T> T[] reverseGenericArray( T[] source )
    {
        T[] target = ( T[] )  new Object[ source.length ];

        for ( int i = 0; i < source.length; i++ )
            target[ source.length - 1 - i ] = source[i];

        return target;
    }

    public static <T> String printGenericArray( T[] source )
    {
        String outString = "Array = [ ";
        for (int i = 0; i < source.length; i++ )
        {
            outString += source[i];
            outString += " ";
        }
        outString += "]";
        return outString;
    }

}
