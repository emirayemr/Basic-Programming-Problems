# OUTLINE OF THE PROBLEM

# Aim is finding the letter grade of a student for a chosen course according to grades that entered by the student.

# The components of the final course grade for some university course are as follows:
  # Midterm examination:  40%
  # Process essay:        30% 
  # Discussion sessions:  20% 
  # In-lecture quizzes:   10%

# Letter grade table for this course: A (90-100)
#                                     A- (86-90)
#                                     B+ (82-86)
#                                     B (78-82)
#                                     B- (74-78)
#                                     C+ (70-74)
#                                     C (66-70)
#                                     C- (62-66)
#                                     D+ (58-62)
#                                     D (54-58)
#                                     F (0-54)

# The program should get points earned from each component as input
  # and should give the resulting letter grade for the course as output


# SOLUTION OF THE PROBLEM

# getting the inputs
midterm = float(input("Please enter your midterm grade: "))
essay = float(input("Please enter your essay grade: "))
discussion = float(input("Please enter your discussion grade: "))
quiz = float(input("Please enter your quiz grade: "))

# the weights of the components
midterm_w = 0.4
essay_w = 0.3
discussion_w = 0.2
quiz_w = 0.1

# calculating the final grade
final_grade = float( midterm * midterm_w + essay * essay_w + discussion * discussion_w + quiz * quiz_w)

# deciding the letter grade (*)

letter_grade = str("null") #initializing variable
if 100 >= final_grade > 90:
  letter_grade = "A"
elif 90 >= final_grade > 86:
  letter_grade = "A-"
elif 86 >= final_grade > 82:
  letter_grade = "B+"
elif 82 >= final_grade > 78:
  letter_grade = "B"
elif 78 >= final_grade > 74:
  letter_grade = "B-"
elif 74 >= final_grade > 70:
  letter_grade = "C+"
elif 70 >= final_grade > 66:
  letter_grade = "C"
elif 66 >= final_grade > 62:
  letter_grade = "C-"
elif 62 >= final_grade > 58:
  letter_grade = "D+"
elif 58 >= final_grade > 54:
  letter_grade = "D"
else:
  letter_grage = "F"

# giving outputs
print("Your final grade:", final_grade)
print("Your letter grade:", letter_grade)