abstract class Person {
    val Aadhar_ID: Int = 0;
    val Name: String = "";
    val Address: String = "";
    val Phone: Int = 0;
    val Profession: String = ""

    open fun Register(UID: Int){
        System.out.println("You registered successfully for: $UID")
    }
    public fun Perform(duty: String){
        System.out.println("")
    }
    public fun Include(service: String){
        System.out.println("You included: $service")
    }
    public fun Like(item: String){
        System.out.println("You liked: $item");
    }

}