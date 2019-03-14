package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R
 * date:28/02/19
 *
 */

public class DayOfWeek {

	
	public static void main(String[] args)
	{
		//inputs from the command line arguments
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		int week=Utility.day(m,d,y);
		
		switch(week)
		{
		case 0:{ System.out.println("Mon");
					break;
				}
		case 1:{ System.out.println("Tue");
					break;
				}
		case 2:{ System.out.println("Wed");
					break;
				}
		case 3:{ System.out.println("Thr");
					break;
				}
		case 4:{ System.out.println("Fri");
					break;
				}
		case 5:{ System.out.println("Sat");
					break;
				}
		case 6:{ System.out.println("sun");
					break;
				}
		
		default:{ System.out.println("Enter the correct day");
					break;
				}
		}
		
	}
}


		
	


