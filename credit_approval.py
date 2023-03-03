#OUTLINE OF THE PROBLEM

# Aim is deciding if an applicant can get credit from a chosen bank. 

# Criteria of the bank for giving credit:
  # If you are under 30 (inclusive) and you are an employee, you can get credit
  # If you are between 31 and 40 years old (31 and 40 inclusive), you can get credit
  # If you are over 40 (exclusive) and your credit rating is excellent, you can get credit

# The program will ask three inputs to the user:
  # age, as an integer
  # employee ("Yes" or "No")
  # credit rating ("Excellent" or "Fair")
# and it should give the decision for the credit application ("Yes" or "No")

#SOLUTION OF THE PROBLEM
print ("Welcome to credit application decider!")

# initialize the boolean variables
employee = bool(True)
credit_rating = bool(True)

# get inputs and update decision (only for negative results)
  # there are only two negative results as below:
age = int(input("Please enter your age: "))
if age <=30:
  emp_input = str(input("Are you currently an employee? (Yes/No)"))
  if emp_input == "No":
    employee = False
elif 40 < age:
  cr_input = str(input("Please enter your credit rating (Excellent/Fair): "))
  if cr_input == "Fair":
    credit_rating = False

# give the decision for credit application
if employee and credit_rating == True:
  print("Yes, you are eligible for credit.")
else:
  print("No, unfortunately you are not eligible for credit.")
