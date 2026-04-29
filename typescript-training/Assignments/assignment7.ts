const sentence: string = "Java programming is fun and challenging";

let words:string[] = sentence.split(" ");

// 1. Count the number of the words in the sectenance
console.log("Total count of words: " + words.length);

// 2.// Print sentence in reverse order of words
let reversedSentence: string = "";
for (let i = words.length - 1; i >= 0; i--) {
    reversedSentence += words[i] + " ";
}
console.log("Reversed sentence: " + reversedSentence);

// 3. // Print each word of sentence with first letter in upper case
let newSentence: string = "";

for (let i = 0; i < words.length; i++) {
    let word = words[i];
    let firstLetter = word[0].toUpperCase();
    let remainingWord = word.slice(1);
    newSentence += firstLetter + remainingWord + " ";
}

console.log("Capitalized sentence: " + newSentence.trim());