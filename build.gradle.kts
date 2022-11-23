import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.5"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	/**
	 * Archunit
	 *
	 * MavenCentral
	 * - https://mvnrepository.com/artifact/com.tngtech.archunit/archunit-junit5
	 * Main 用途
	 * - アーキテクチャの設計思想を単体テスト化
	 * Sub 用途
	 * - なし
	 * 概要
	 * - ArchUnit の JUnit5 バージョン
	 *   - 他には、JUnit4 バージョンやプレーンな archunit が存在する。
	 *   - 本リポジトリでは JUnit5 バージョン以外不要
	 * - アーキテクチャの設計思想を守れているか、単体テストで確認可能になる
	 *   - CI に組み込むことで、PR、マージ時点で、発見可能
	 * - テスト対象
	 *   - パッケージ、クラス、レイヤー、循環参照など
	 */
	testImplementation("com.tngtech.archunit:archunit-junit5:1.0.0")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
