fun splitLines (str:  String): Array<String> {
    return str.trimIndent().trim().split("[\r\n]+".toRegex()).toTypedArray()
}

fun extractNumbersFromLine(line: String, delimiter: String = " "): MutableList<Long> {
    val sanitisedline = line.replace("  "," ")
    val result : MutableList<Long> = mutableListOf()
    sanitisedline.split(delimiter).forEach{result.add(it.toLong())}
    return result
}