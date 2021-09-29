//1920. Build Array from Permutation
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function (nums) {
    let arr = [];
    for (let i = 0; i < nums.length; i++) {
        arr.push(nums[nums[i]]);
    }
    return arr;
};
console.log("1920.Build Array from Permutation: ", buildArray([0, 2, 1, 5, 3, 4]))

//1929. Concatenation of Array
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function (nums) {
    return [...nums, ...nums];
    //cach 2: for(var i in nums) {
    //     nums.push(nums[i]);
    // }
    // return nums;
};
console.log("1929. Concatenation of Array: ", getConcatenation([1, 3, 2, 1]))

//1.Two Sum
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return [i, j]
            }
        }
    }
};
console.log("1.Two Sum: ", twoSum([2, 7, 11, 15], 9), "target: ", 9)

//26. Remove Duplicates from Sorted Array
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    if (nums.length === 0) return 0
    let i = 0;
    let j = 1;
    while (j < nums.length) {
        if (nums[j] !== nums[i]) {
            i++
            nums[i] = nums[j]
            j++
        } else j++
    }
    return i + 1
};
console.log("Remove Duplicates from Sorted Array: ", removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]))