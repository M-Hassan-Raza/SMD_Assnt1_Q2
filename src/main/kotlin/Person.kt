abstract class Person {
    val Aadhar_ID: Int = 0;
    val Name: String = "";
    val Address: String = "";
    val Phone: Int = 0;
    val Profession: String = ""

    open fun Register(UID: Int): String{
        return "You registered successfully for: $UID"
    }
    public fun Perform(duty: String): String{
        return "You sucessfully performed $duty duty";
    }
    public fun Include(service: String): String{
        return "You included: $service";
    }
    public fun Like(item: String): String{
        return "You liked: $item";
    }

}