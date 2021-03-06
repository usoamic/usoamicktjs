package io.usoamic.usoamicktjs.core

import io.usoamic.web3kt.core.contract.other.ContractWrapper
import io.usoamic.web3kt.core.contract.response.CallResponse
import io.usoamic.web3kt.core.contract.response.ExecuteResponse

interface Owner : ContractWrapper {
    @JsName("setFrozen")
    fun setFrozen(frozen: Boolean): ExecuteResponse

    @JsName("setOwner")
    fun setOwner(newOwner: String): ExecuteResponse

    @JsName("getOwner")
    fun getOwner(): CallResponse<String>

    @JsName("getFrozen")
    fun getFrozen(): CallResponse<Boolean>
}