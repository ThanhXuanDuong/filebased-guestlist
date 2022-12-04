# Aufgabe: filebased-guestlist

Der Kunde möchte gerne eine Gästeliste haben, auf welcher die Namen aller Gäste stehen sollen.
Damit die Liste nicht verloren geht, soll diese in eine Textdatei gespeichert und auch aus dieser ausgelesen werden.

Test 1

Schreibe einen Test shouldBeEmptyInitially, der:
- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit einer leeren Liste aufruft
- dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein) 
- und prüft, dass dieses Ergebnis eine leere Liste ist

Test 2
Schreibe einen Test shouldReadSameGuestsAsWrittenBefore, der
- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit Karl und Ute aufruft
- dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)
- und prüft, dass dieses Ergebnis Karl und Ute enthält

Test 3
Schreibe einen Test shouldWriteToFileSystem, der
- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit Theodor und Anette aufruft
- und prüft, dass die Datei guests.txt angelegt wurde und die Zeilen "Theodor" und "Anette" enthält

Test 4
Schreibe einen Test shouldReadFromFileSystem, der
- In die Datei guests.txt Stephan und Max schreibt (als Zeilen)
- eine Instanz von der Klasse "GuestList" erzeugt
- dann getGuests aufruft
- und prüft, dass "Stephan" und "Max" gelesen wurden

BONUS
- Schreibe einen Test, der prüft, dass beim Lesen eine Exception auftritt, wenn die Datei nicht existiert
- Füge eine addGuest-Methode hinzu, die als Parameter einen String guest erhält und diesen als zusätzliche Zeile in die Datei schreibt.
