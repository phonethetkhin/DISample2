package com.ptk.disample2

data class Skills(val skillList:List<SkillModel>)

data class SkillModel(val skillName:String, val proficiencyRate:Int)