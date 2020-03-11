# problem-Caesar_Cipher

1-Review:

Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

    Original alphabet:      abcdefghijklmnopqrstuvwxyz
    Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
    
For example, the given cleartext s=There's-a-starman-waiting-in-the-sky  and the alphabet is rotated by k=3 . The encrypted string is Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted. 

2-Input Format

The first line contains contains the unencrypted string s .
The second line contains k the number of letters to rotate the alphabet by.

3-Output Format

For each test case, print the encoded string.

EX:

1-Input :

    middle-Outz
    2
    
2-Output:

    okffng-Qwvb
    
3-Explanation

    Original alphabet:      abcdefghijklmnopqrstuvwxyz
    Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

    m -> o
    i -> k
    d -> f
    d -> f
    l -> n
    e -> g
    -    -
    O -> Q
    u -> w  
    t -> v
    z -> b
    
