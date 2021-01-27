package com.example.webdemo.datasource.mock


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()
        // then
        //Assertions.assertThat(banks).isNotEmpty
        assertThat(banks).isNotEmpty

    }
    
    @Test
    fun `should provide some mock data`(){
    // given
    val banks = mockDataSource.retrieveBanks()
    // when
    
    // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
    }
    


}