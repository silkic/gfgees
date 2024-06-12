<h2><a href="https://www.geeksforgeeks.org/problems/minimum-move-to-front-operations2232/1?page=1&category=Arrays&sortBy=difficulty">Minimum move to front operations</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array arr[] of size n such that array elements are distinct and in the range from 1 to n. The task is to count minimum number of move-to-front operations to arrange items as {1, 2, 3,… n}. The "<strong>move-to-front"</strong> operation is to pick any element arr[i] and place it at first position.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N=4
arr[] = {3, 2, 1, 4} 
<strong>Output:</strong> 2
<strong>Explanation</strong>:
We need to perform<strong> "move-to-front" </strong>on 1 
and 2 to make the array sorted.&nbsp;            </span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N=7
arr[] = {5, 7, 4, 3, 2, 6, 1} 
<strong>Output:</strong> 6
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>minMoves()</strong> that takes <strong>array a</strong> and <strong>n</strong>&nbsp;as parameters and return the minimum number of move to front operation to sort the array.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<strong>.<br>
Expected Auxiliary Space: </strong>O(1)<strong>.</strong></span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;