## README.md
### Frågor & svar

#### Datasäkerhet/Inkapsling: Hur har du skyddat kontots uppgifter i din kod, och vad hade kunnat hända om du inte gjorde det?

Jag använder inkapsling för att skydda kontonas uppgifter. Fälten owner och balance är privata, vilket tvingar Main att läsa dem med getOwner och getBalance, och ändra saldot med deposit och withdraw. Hade de varit publika, kunde en bakdörr ha skapats, eftersom Main hade kunnat skriva balance = -99999 direkt utan att gå genom metoderna.

#### Skapande-mönster (Factory): Varför skapas kontot via registrets metod istället för direkt ute i Main?

Så att kontot ska hamna i registrets lista. På så sätt sköter registret både skapandet och tillägget i listan.

#### Flöde: Beskriv ett av menyvalen steg för steg (vad användaren matar in → vilket objekt som hanterar det → vilken metod som körs → vad som skrivs ut).

Användaren väljer 3 "Sätt in pengar" och anger kontots ägarnamn, vilket Main använder för att söka med findAccount(owner). Om kontot finns: användaren anger beloppet, och Main anropar deposit(amount) på det hittade kontoobjektet. Metoden kontrollerar beloppet och gör insättningen om den är giltig. Därefter visar Main saldot med getBalance(). Om sökningen inte hittade något konto visas i stället "Konto saknas."

#### Reflektion (3–5 meningar): Hur gjorde du när du körde fast eller stötte på ett problem? Om du använde verktyg som AI, Google eller kursmaterial: ge ett konkret exempel på hur du tog hjälp för att förstå och lösa problemet själv.

I första hand sökte jag i kursmaterialet i repot och i mina egna anteckningar i Obsidian. Jag Googlade sällan men Copilot integrationen i VSCode har både hjälpt OCH stjälpt flera gånger under arbetets gång. Vi höll på att säga upp vänskapen där ett tag. Jag tog även hjälp av ChatGPT för att planera och dela upp arbetet, vilket underlättar för min ADHD-hjärna. De mest konkreta och återkommande problemen är nog att jag ofta glömmer måsvingar och semikolon, då har felmeddelandena i "Problems" hjälpt för att hitta fel. Jag har även blivit flitig användare av Alt+Shift+F för att få ordning på indrag.
