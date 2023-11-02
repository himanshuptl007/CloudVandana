function reverseWords(sentence) {
    return sentence.split(' ').map(word => {
        return word.split('').reverse().join('');
    }).join(' ');
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
