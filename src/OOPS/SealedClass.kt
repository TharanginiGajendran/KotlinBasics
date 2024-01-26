package OOPS

/**
 * sealed class ia a special type of class,that can have fixed set of subclasses
 * These subclasses are defined within the same file as sealed class
 * All the subclasses of sealed class are known by the compiler
 */

fun main(){
    val success = ExamResult.Pass("You are passed")
    val fail = ExamResult.Fail("You are failed")
    val marks = 93
    val failMark = 50

    if (marks < failMark){
        loadResult(fail)
    }
    else{
        loadResult(success)
    }
}

sealed class ExamResult{
    data class Pass(val passResult: String): ExamResult()
    data class Fail(val failResult: String): ExamResult()
}

fun loadResult(result: ExamResult){
    when(result){
        is ExamResult.Pass -> println(result.passResult)
        is ExamResult.Fail -> println(result.failResult)
    }
}