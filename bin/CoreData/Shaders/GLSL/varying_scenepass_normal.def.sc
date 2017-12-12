vec4 vTexCoord      : TEXCOORD0 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vTangent       : TANGENT   = vec4(0.0, 0.0, 0.0, 0.0);
vec3 vNormal        : NORMAL    = vec3(0.0, 0.0, 1.0);
vec4 vColor         : COLOR0    = vec4(1.0, 1.0, 1.0, 1.0);
vec4 vWorldPos      : TEXCOORD1 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vShadowPos0    : TEXCOORD2 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vShadowPos1    : TEXCOORD3 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vShadowPos2    : TEXCOORD4 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vShadowPos3    : TEXCOORD5 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 vSpotPos       : TEXCOORD5 = vec4(0.0, 0.0, 0.0, 0.0);
vec3 vCubeMaskVec   : TEXCOORD5 = vec3(0.0, 0.0, 0.0);
vec3 vVertexLight   : TEXCOORD4 = vec3(0.0, 0.0, 0.0);
vec4 vScreenPos     : TEXCOORD5 = vec4(0.0, 0.0, 0.0, 0.0);
vec3 vReflectionVec : TEXCOORD6 = vec3(0.0, 0.0, 0.0);
vec2 vTexCoord2     : TEXCOORD7 = vec2(0.0, 0.0);

vec4 a_position  : POSITION;
vec3 a_normal    : NORMAL;
vec2 a_texcoord0 : TEXCOORD0;
vec4 a_color0    : COLOR0;
vec2 a_texcoord1 : TEXCOORD1;
vec4 a_tangent   : TANGENT;
vec4 a_weight    : BLENDWEIGHT;
ivec4 a_indices  : BLENDINDICES;

vec4 i_data0     : TEXCOORD3;
vec4 i_data1     : TEXCOORD4;
vec4 i_data2     : TEXCOORD5;
vec4 i_data3     : TEXCOORD6;
vec4 i_data4     : TEXCOORD7;
vec4 i_data5     : TEXCOORD0;
vec4 i_data6     : TEXCOORD1;
vec4 i_data7     : TEXCOORD2;
