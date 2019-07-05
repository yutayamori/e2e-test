/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package e2e.test

import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.WebDriverRunner

class Main {


    fun test() {

        // ChromeDriver を headless モードで利用
        Configuration.browser = WebDriverRunner.CHROME
//        Configuration.headless = true
        Configuration.reportsFolder = "test-result/reports"
        Configuration.browserSize = "1024x768"


        // Googleトップページ
        // "selenide"を検索
        open("https://www.google.co.jp/")
        `$`("input[type=text]").`val`("selenide").pressEnter()

        // 検索ページ
        // Selenideの公式ページをクリック
        `$`(byText("Selenide: concise UI tests in Java")).click()

        // Selenide公式ページ
        // 「What is Selenide?」という文言があることを確認
        `$`("body").shouldHave(text("What is Selenide?"))


    }
}
