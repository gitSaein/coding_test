let N = 10
let arr = [...new Array(10)].map(e => parseInt(Math.random() * 50) + 1)
let target = parseInt(Math.random() * 1000) + 1

let dapArr = []

console.log(N, arr, ta)

function rec(depth) {
    if (depth === N) {
        console.log(dapArr)
        return
    }

    dapArr[depth] = arr[depth] * 1
    rec(depth + 1)

    dapArr[depth] = arr[depth] * -1
    rec(depth + 1)
}

rec(0)