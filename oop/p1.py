import difflib
import re

def load_dictionary():
    return set([
        "ગુજરાત", "ભારત", "શાળા", "વિદ્યાર્થી", "શિક્ષક",
        "પુસ્તક", "મિત્ર", "ઘર", "શહેર", "ભાષા",
        "કમ્પ્યુટર", "વિજ્ઞાન", "અભ્યાસ", "પરીક્ષા",
        "વિદ્યાલય", "મહાવિદ્યાલય", "સમય", "દિવસ",
        "રાત", "પાણી", "ખોરાક", "માતા", "પિતા",
        "મિત્રો", "રમત", "બાળક", "કામ", "વિભાગ",
        "લખવું", "વાંચવું", "જ્ઞાન", "શક્તિ",
        "સૂર્ય", "ચંદ્ર", "આકાશ", "પૃથ્વી", "પ્રકાશ"
    ])

def tokenize(text):
    return re.findall(r'\w+', text, re.UNICODE)

def suggestions(word, dictionary):
    return difflib.get_close_matches(word, dictionary, n=3, cutoff=0.6)

def spell_check(text, dictionary):
    words = tokenize(text)
    incorrect = {}
    for w in words:
        if w not in dictionary:
            incorrect[w] = suggestions(w, dictionary)
    return incorrect

def display(text, incorrect):
    print("\n----- SPELL CHECK RESULT -----\n")
    print("Your Input:")
    print(text)
    if not incorrect:
        print("\nNo spelling mistakes found")
    else:
        print("\nMistakes and Suggestions:\n")
        for word in incorrect:
            print("Word:", word)
            if incorrect[word]:
                print("Suggestions:", ", ".join(incorrect[word]))
            else:
                print("Suggestions: None")
            print()

def main():
    dictionary = load_dictionary()
    while True:
        print("\n====== Dictionary Spell Checker ======")
        text = input("\nEnter Gujarati/Hindi sentence:\n")
        result = spell_check(text, dictionary)
        display(text, result)
        choice = input("\nDo you want to check again? (yes/no): ").lower()
        if choice != "yes":
            print("\nProgram Ended")
            break

main()