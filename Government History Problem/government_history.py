# OUTLINE OF THE PROBLEM

# A list of elected parties and their duration intervals for being government are given.
# The aim is to calculate the total number of years of a particular party being in power.

# Program will get a party name as input, and it should give its total number of yeats being in power.

# Given lists
parties = ["AKP", "ANAP", "AP", "CGP", "CHP", "CKMP", "DP", "DSP", "DTP", "DYP","HDP", "MGP", "MHP", "MP","MSP", "RP", "SHP", "YTP"]
dates = [["2002-2023"], ["1983-1991", "1997-2002"], ["1961-1962", "1965-1974", "1975-1977", "1977-1978", "1979-1980"], ["1963-1965", "1971-1974", "1978-1979", "2015-2015"], ["1923-1935", "1935-1950", "1971-1973", "1974-1974", "1977-1977", "1978-1979", "1995-1996"], ["1962-1963", "1965-1965"], ["1950-1960"],	["1997-2002"], ["1997-1999"], ["1991-1997", "1996-1997"], ["2015-2015"], ["1971-1973"], ["1975-1977", "1977-1978", "1999-2002"], ["1965-1965"], ["1974-1974", "1975-1977", "1977-1978"], ["1996-1997"], ["1991-1995"], ["1962-1963", "1965-1965"]]

# SOLUTION OF THE PROBLEM
party = str(input("Please enter a party name: "))

found = bool(False)
idx = 0

i = 0 
while i < len(parties):
  if party == parties[i]:
    idx = i
    found = True
  i += 1

if found == True:
  party_dates = dates[idx]
  sum = 0

  j = 0
  while j < len(party_dates):
    date = str(party_dates[j])

    begin = int(date[:4])
    end = int(date[5:9])
    sum += end-begin+1

    j+=1

  print(party, "ruled for", sum, "years.")
else:
  print("Party name is invalid.")
