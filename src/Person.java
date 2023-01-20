import java.time.Year;

public class Person {
    private String FirstName;
    private String LastName;
    private String ID;
    private String Title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        FirstName = firstName;
        LastName = lastName;
        this.ID = ID;
        Title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", Title='" + Title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    /**
     * Method to get the Full Name from the Person Object
     *
     * @return return the First and Last Name as a full Name String
     */

    public String GetFullName()
    {
        return FirstName + " " + LastName;
    }

    /**
     * Method to get the formal name from the person object
     *
     * @return return the Title first and Last Name arranged as a Formal Name String
     */

    public String GetFormalName()
    {
        return Title + " " + FirstName + " " + LastName;
    }
/**
 * Get the Age as an int assuming that it is for the current year
 *
 * @return  the current Age
 *
 */

public int GetAge()
{
    return Integer.parseInt(Year.now().toString()) - YOB;
}

    /**
     *
     * @param Year the year that you want to use to determine the age at that time
     * @return
     */
    public int GetAge(int Year)
    {
        return Year - YOB;
    }

}
