# OUTLINE OF THE PROBLEM

# Leap years are any year that can be evenly divided by 4.
  # Except if it can be evenly divided by 100, then it isn't a leap year (2100, 2200...)
    # However, if it can be evenly divided by 100 and 400, then it is a leap year (2000, 2400...)
# The program will get an year from the user and it will decide if it is a leap year.

# SOLUTION OF THE PROBLEM
print("Welcome to leap year checker!")

# initialize the boolean variables
is_leap_year = bool(False)

# get input year
year = int(input("Please enter the year will be checked: "))

# decision control only for 2 negative conditions:
  # divisible by 4 & not divisible by 100 -> leap year
  # divisible by 4 & divisible by 100 & divisible by 400 -> leap year
if year % 4 == 0:
  if year % 100 != 0:
    is_leap_year = True
  else:
    if year % 400 == 0:
      is_leap_year = True

if is_leap_year == True:
  print("The year " + str(year) + " is a leap year.")
else:
  print("The year " + str(year) + " is not a leap year.")
