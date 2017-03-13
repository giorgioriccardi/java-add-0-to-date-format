
/**
 * Class for PurchaseDate logic.
 *
 * Assignment02
 *
 * @author Giorgio Riccardi
 * @version 11/03/2017
*/

import java.text.DateFormat;
import java.util.Date;

public class PurchaseDate
{
    // instance variables
    private int year;
    private int month;
    private int day;

    private static final int CURRENT_YEAR = 2017;

    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;

    private static final int FIRST_DAY = 1;
    private static final int LAST_DAY = 31;

    /**
     * Default Constructor for objects of class PurchaseDate
     */
    public PurchaseDate()
    {

    }

    /**
     * Constructor for Objects of class PurchaseDate.
     *
     * @param theYear to initialize year field
     * @param theMonth to initialize month field
     * @param theDay to initialize day field
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
      if (theYear >= 1900 && theYear <= CURRENT_YEAR)
      {
          this.setTheYear(theYear);
      }
      else
      {
          year = CURRENT_YEAR;
      }

      if (theMonth >= JANUARY && theMonth <= DECEMBER)
      {
          this.setTheMonth(theMonth);
      }
      else
      {
          month = JANUARY;
      }

      if (theDay >= FIRST_DAY && theDay <= LAST_DAY)
      {
          this.setTheDay(theDay);
      }
      else
      {
          day = FIRST_DAY;
      }
    }

    /**
     * Sets the year of this Purchase.
     *
     * @param theYear The new year.
     */
    public void setTheYear(int theYear)
    {
      if (theYear <= CURRENT_YEAR)
      {
          year = theYear;
      }
    }

    /**
     * Get the year of this Purchase.
     *
     * @return The year of this Purchase.
     */
    public int getTheYear()
    {
        return year;
    }

    /**
     * Sets the month of this Purchase.
     *
     * @param theMonth The new month.
     */
    public void setTheMonth(int theMonth)
    {
      if (theMonth >= JANUARY && theMonth <= DECEMBER)
      {
          month = theMonth;
      }
    }

    /**
     * Get the month of this Purchase.
     *
     * @return The month of this Purchase.
     */
    public int getTheMonth()
    {
        return month;
    }

    /**
     * Sets the day of this Purchase.
     *
     * @param theDay The new day.
     */
    public void setTheDay(int theDay)
    {
      if (theDay >= FIRST_DAY && theDay <= LAST_DAY)
      {
          day = theDay;
      }
    }

    /**
     * Get the day of this Purchase.
     *
     * @return The day of this Purchase.
     */
    public int getTheDay()
    {
        return day;
    }

    /**
     * Get the full date of this Purchase.
     *
     * @return The date of this Purchase.
     */
    public String getTheDate()
    {
      return year + "-" + (month<10?"0"+month:month) + "-" + (day<10?"0"+day:day); // minified
    }

	// method with compact notation (readble)
	public static String getTheDate1() {
		return year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
	}

	// method with expanded notation
	public static String getTheDate2() {
		String result = year + "-";
		if (month < 10)
			result += "0" + month + "-";
		else
			result += month + "-";
		if (day < 10)
			result += "0" + day;
		else
			result += day;
		return result;
	}

	// with lZero method
  // by https://github.com/afranceschetti/
	public static String getTheDate3() {
		return year + "-" + lZero(month, 2) + "-" + lZero(day, 2);
	}

	private static String lZero(int val, int outputLength) {
		String result = "" + val;
		if (result.length() < outputLength) {
			String zeros = "";
			for (int i = 0; i < outputLength - result.length(); i++) {
				zeros += "0";
			}
			result = zeros + result;
		}
		return result;
	}
  // credits to https://github.com/afranceschetti/

}
