module.exports = arr => sort(arr)

const sort = arr => {
    const length = arr.length
    for (let i = 0; i < length; i++) {
        if (i !== length - 1) {
            if (arr[i] >= arr[i + 1]) {
                arr = arr.filter(item => item !== arr[i + 1])
                return sort(arr)
            }
        }
    }
    return arr
}
