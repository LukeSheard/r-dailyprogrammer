import re
import sys

successString = "is an anagram of"
failureString = "is NOT an anagram of"

if (len(sys.argv) < 4):
  print "Inproper use of file"
  sys.exit(1)

words = sys.argv[1: 4]

def toSortedArray(word):
  letters = re.sub(r'[^\w]', "", word).lower()
  lettersArray = list(letters)
  return sorted(lettersArray)

originalWord = toSortedArray(words[0])
comparisonWord = toSortedArray(words[1])

words[1] = successString if originalWord == comparisonWord else failureString

print " ".join(words)
