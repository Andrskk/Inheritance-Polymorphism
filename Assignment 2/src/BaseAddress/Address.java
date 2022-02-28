package BaseAddress;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * Address base class. Contains two dates and determines whether an object is obsolete or not.
 * Contains equals method to compare two objects and toString method to display object information.
 */
public class Address {

    //Instance variables initialization
    protected String validFrom;
    protected String validTo;
    protected boolean isObsolete;

    //Default constructor
    public Address()
    {
        this.validFrom="1955-01-01";
        this.validTo="2100-01-01";
        this.isObsolete=false;
    }
    //Parameterized constructor
    public Address(String validFrom, String validTo)
    {
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.isObsolete = isObsolete();
    }
    //Copy constructor
    public Address(Address address)
    {
        this.validFrom=address.getValidFrom();
        this.validTo=address.getValidTo();
        this.isObsolete=address.isObsolete();
    }

    /**
     * Method to get a date an address is valid from.
     * @return a date in format "YYYY"-"MM"-"DD" as a String.
     */
    public String getValidFrom()
    {
        return validFrom;
    }

    /**
     * Method to get a date an address is valid to.
     * @returna date in format "YYYY"-"MM"-"DD" as a String.
     */
    public String getValidTo() { return validTo; }

    /**
     * Method to check if an address is obsolete.
     * @return true if an address is out of dateFrom and dateTo, false otherwise.
     */
    public boolean isObsolete()
    {
        //Converting String address attributes to integers for further comparing with passing date
        int addressYearFrom=Integer.parseInt(getValidFrom().substring(0,4));
        int addressMonthFrom=Integer.parseInt(getValidFrom().substring(5,7));
        int addressDayFrom=Integer.parseInt(getValidFrom().substring(8,10));

        int addressYearTo=Integer.parseInt(getValidTo().substring(0,4));
        int addressMonthTo=Integer.parseInt(getValidTo().substring(5,7));
        int addressDayTo=Integer.parseInt(getValidTo().substring(8,10));

        int currentYear=2021;
        int currentMonth=3;
        int currentDay=18;


        if (currentYear<addressYearFrom)
        {
            return (true);
        }
        else if (currentYear>addressYearFrom&&currentYear<=addressYearTo)
        {
            if (currentYear==addressYearTo)
            {
                if (currentMonth>addressMonthTo)return (true);
                else if (currentMonth<addressMonthTo)return (false);
                else
                {
                    if (currentDay<addressDayTo) return (false);
                    else if (currentDay>addressDayTo)return (true);
                    else return (false);
                }
            }

        }
        else if (currentYear>addressYearTo)
            {
                return (true);
            }
            else
            {
                if (currentMonth<addressMonthFrom)return (true);
                else if (currentMonth>addressMonthFrom&&currentYear<addressYearTo)return (false);
                else if (currentMonth>addressMonthFrom&&currentYear>addressYearTo)return (true);
                    else
                    {
                        if (currentDay<addressDayFrom) return (true);
                        else if (currentDay>addressDayFrom&&currentYear<addressYearTo)return (false);
                        else if (currentDay>addressDayFrom&&currentYear>addressYearTo)return (true);
                    }
            }
        return (false);
    }

    /**
     * Method to check if an address is obsolete according to passing date.
     * @param year Receives a year as an integer.
     * @param month Receives a month as an integer.
     * @param day Receives a day as an integer.
     * @return true if an address is out of passing date, false otherwise.
     */
    public boolean isObsolete(int year,int month,int day)
    {
        //Converting String address attributes to integers for further comparing with passing date
        int addressYearFrom=Integer.parseInt(getValidFrom().substring(0,4));
        int addressMonthFrom=Integer.parseInt(getValidFrom().substring(5,7));
        int addressDayFrom=Integer.parseInt(getValidFrom().substring(8,10));

        int addressYearTo=Integer.parseInt(getValidTo().substring(0,4));
        int addressMonthTo=Integer.parseInt(getValidTo().substring(5,7));
        int addressDayTo=Integer.parseInt(getValidTo().substring(8,10));

        int currentYear=year;
        int currentMonth=month;
        int currentDay=day;


        if (currentYear<addressYearFrom)
        {
            return (true);
        }
        else if (currentYear>addressYearFrom&&currentYear<=addressYearTo)
        {
            if (currentYear==addressYearTo)
            {
                if (currentMonth>addressMonthTo)return (true);
                else if (currentMonth<addressMonthTo)return (false);
                else
                {
                    if (currentDay<addressDayTo) return (false);
                    else if (currentDay>addressDayTo)return (true);
                    else return (false);
                }
            }

        }
        else if (currentYear>addressYearTo)
            {
                return (true);
            }
            else
            {
                if (currentMonth<addressMonthFrom)return (true);
                else if (currentMonth>addressMonthFrom&&currentYear<addressYearTo)return (false);
                else if (currentMonth>addressMonthFrom&&currentYear>addressYearTo)return (true);
                    else
                    {
                        if (currentDay<addressDayFrom) return (true);
                        else if (currentDay>addressDayFrom&&currentYear<addressYearTo)return (false);
                        else if (currentDay>addressDayFrom&&currentYear>addressYearTo)return (true);
                    }
            }
        return (false);
    }

    /**
     * Method to set an address is obsolete in case it is out of passing date.
     * @param year Receives a year as an integer.
     * @param month Receives a month as an integer.
     * @param day Receives a day as an integer.
     */
    public void setObsolete(int year,int month,int day)
    {
        //Converting String address attributes to integers for further comparing with passing date
        int addressYearFrom=Integer.parseInt(getValidFrom().substring(0,4));
        int addressMonthFrom=Integer.parseInt(getValidFrom().substring(5,7));
        int addressDayFrom=Integer.parseInt(getValidFrom().substring(8,10));

        int addressYearTo=Integer.parseInt(getValidTo().substring(0,4));
        int addressMonthTo=Integer.parseInt(getValidTo().substring(5,7));
        int addressDayTo=Integer.parseInt(getValidTo().substring(8,10));

        int currentYear=year;
        int currentMonth=month;
        int currentDay=day;

        if (currentYear<addressYearFrom)
        {
            this.isObsolete=true;
        }
        else if (currentYear>addressYearFrom&&currentYear<=addressYearTo)
        {
            if (currentYear==addressYearTo)
            {
                if (currentMonth>addressMonthTo)this.isObsolete=true;
                else if (currentMonth<addressMonthTo)this.isObsolete=false;
                else
                {
                    if (currentDay<addressDayTo) this.isObsolete=false;
                    else if (currentDay>addressDayTo)this.isObsolete=true;
                    else this.isObsolete=false;
                }
            }

        }
        else if (currentYear>addressYearTo)
            {
                this.isObsolete=true;
            }
            else
            {
                if (currentMonth<addressMonthFrom)this.isObsolete=true;
                else if (currentMonth>addressMonthFrom&&currentYear<addressYearTo)this.isObsolete=false;
                else if (currentMonth>addressMonthFrom&&currentYear>addressYearTo)this.isObsolete=true;
                    else
                    {
                        if (currentDay<addressDayFrom) this.isObsolete=true;
                        else if (currentDay>addressDayFrom&&currentYear<addressYearTo)this.isObsolete=false;
                        else if (currentDay>addressDayFrom&&currentYear>addressYearTo)this.isObsolete=true;
                    }
            }
    }

    /**
     * Method to compare two objects of Address type.
     * @param anotherObject Receives a parameter of class Object, then cast it to Address type. Compare it with "this"
     * object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            Address anotherAddress = (Address) anotherObject;
            return this.validFrom.equals(anotherAddress.getValidFrom())
                    &&this.validTo.equals(anotherAddress.getValidTo())
                    &&this.isObsolete==anotherAddress.isObsolete();
        }
        else return false;
    }

    /**
     * Method of a base class to display an address information. Will be overridden by derived classes.
     * @return
     */
    public String toString() {return "This";}

    /**
     * Method of a base class to display a brief information of address. Will be overridden by derived classes.
     * @return
     */
    public String display()
    {
        return "";
    }
}